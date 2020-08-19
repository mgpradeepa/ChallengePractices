package com.mgp.hackerrank.warmup;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/***
 * Condition
 * 1 --> append - Append string  to the end of .
 * 2 --> delete - Delete the last  characters of .
 * 3 --> print - Print the  character of .
 * 4 --> undo - Undo the last (not previously undone) operation of type  or , reverting  to the state it was in prior to that operation.
 *
 */
public class TextEditor {
    private static String S = "";
    private static Stack<Operation> operationStack = new Stack<>();


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int nop = Integer.parseInt(sc.nextLine());
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String content;
        int toDelete = 0;
        int toPrint = 0;
        BufferedReader bfr = null;

        bfr = new BufferedReader(new InputStreamReader(System.in)) ;

        for(int i = 0 ; i < nop; i++) {

            String input = sc.nextLine();
            String[] tokens = input.split("\\s+");

            int option = Integer.parseInt(tokens[0]);
            if (option == 1) {
                content = tokens[1];
                Operation oper = new Operation("append", content);
                operationStack.push(oper);
                performOPeration(oper);
            }
            else if (option == 2) {
                toDelete = Integer.parseInt(tokens[1]);
                Operation oper = new Operation("delete", String.valueOf(toDelete));
                operationStack.push(oper);
                performOPeration(oper);
            }
            else if (option == 3) {
                toPrint =Integer.parseInt(tokens[1]);
                Operation oper = new Operation("print", String.valueOf(toPrint));
                performOPeration(oper);

            }
            else if (option == 4) {
                Operation oper = new Operation("undo", null);
                performOPeration(oper);
            }


        }



    }

    private static void performOPeration(Operation oper) {
        switch(oper.operationType) {
            case "append" :
                StringBuffer sbf = new StringBuffer(S);
                sbf.append(oper.parameters);
                S = sbf.toString();
//                System.out.println("S append ---> " +S);
                break;

            case "delete":
                int kCha = Integer.parseInt(oper.parameters) -1;
                if(S.length() > kCha){
                    String tmp = S;
                    S = tmp.substring(0, tmp.length()-1 - kCha);
                }
                break;

            case "print" :
                int kPri = Integer.parseInt(oper.parameters);
                System.out.println(S.charAt(kPri-1));

                break;

            case "undo" :
                if(!operationStack.empty()) {
                    Operation op = operationStack.pop();
                    if(op.operationType.equals("delete") ) {
                        Operation or = operationStack.peek();
                        if(or.operationType.equals("append")) {
                            performOPeration(or);
                        }
                    }else if (op.operationType.equals("append")) {
                        int charTodelete = op.parameters.length();
                        Operation opr = new Operation("delete", String.valueOf(charTodelete));
                        performOPeration(opr);

                    }


                    break;

                }
            default: break;


        }




    }

    static class Operation {
        String operationType;
        String parameters;

        Operation(String operationType, String parameters) {
            this.operationType = operationType;
            this.parameters = parameters;
        }

        @Override
        public String toString() {
            return "Operation{" +
                    "operationType='" + operationType + '\'' +
                    ", parameters='" + parameters + '\'' +
                    '}';
        }


    }
}
