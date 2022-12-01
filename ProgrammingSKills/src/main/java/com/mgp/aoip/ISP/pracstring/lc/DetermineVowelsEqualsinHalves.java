package com.mgp.aoip.ISP.pracstring.lc;

public class DetermineVowelsEqualsinHalves {
    public static void main(String[] args) {
        String s = "gfLpdQfBhLSNWKBvRWpNlRWTSMQYTSyPFTwWHptvnJHFWQDQLdYyHzKJjYrpHbNQyPFWpKhChZXsvYfPBVMpRSfLZwHMBqsbPhZBhwfmjDqgXVkZrtyXbpXWVLRnpGPWjvKNHmxqxPSlvxxsxsnbQvKJDwKtWgFDrjsgvTScXYPsMBgkWktkdthwsQdCpddrgksxlZMYDcPyvMLqztnYGQbrKcKPWqtjdklXZBvNbZfNdNRmbDGpxybGdzghpSmGvmZGpJlfwTbLhQXZSfgSJTNvrQGdWyQgJjngKLXNpkMtFWgpcrYHZHJdgDfmkfplDYjWRmBNyFNzgGbRcGBQXWcskPpXPlBkdsVwRMNZCLvkdXwDrlcTTNPPMvjPChWHQPJMPSLSzQLlkQWrmLLnknVdWKrYZRymTQTRDbsgtFjZQjMNdrZVqQdBdywVqSWkkHHmbrwnlzXwYCpbfJSxBPdwDjKQFgYPChQWdJTHRVYRDrLtswMnTNQCjZNsqZBpXjZxWKblqZFxtZgHCjYsbqJZFjQJZlFptgMXVDykQpHlmPzxpKnQNtYDJNhHZkMLVCXJjgRGYwCbNGmkqgRkYjzpBMJHRLkbsgXpMkMWCDncmGXBxzZsSrGshcYKClqTyZPcGBJthqXjVlJWNYtPgXkFQSxXxGwsvbgPQQZQfllFfQbXMCkqXtTxDlSkgBGfVSSfWCwbzgFnLlMKLQgccrQSyxRyqyXvCzCBGdzPhxLnvJMyDhpWXWNFXwcwHCCMsccvrxbtsjcThqsLMrgkxlLLGKCbtdHqvBKjxlmntDrvCKxwpMrWZycsvDjCRjPXQPZxmvHnxGWpBqkJCkcqfmyRHPSgGxxkHgSLXNsfVxQRwbftyCxvzHrCzXKXfghSwTMpDzBhmjXLdxFCfpSggVkTVFPQTJCrCwfyVLNQGSLJKVRKtHCwHMNyclLNHHZTzbLJdtkQRzrPVgXSLhJKVZlqYVzPsmwZYPmqKhQC";
        System.out.println(halvesAreAlike(s));

    }

    private static  boolean halvesAreAlike(String s) {
        //convert the entire string to lowercase
        // substring to mid
        // strCahartAt (each) if vowel count is even then true
        //

        String loweString = s.toLowerCase();
//        System.out.println(loweString);
        int stringLength = s.length() ;
//        System.out.println(stringLength + "is the length ofString "+ loweString);
        String left  = loweString.substring(0, stringLength/2);
        String right = loweString.substring(stringLength/2, stringLength);

//        System.out.println(" left -> " + left);
//        System.out.println("\n\n right -> " + right);

        int leftCount = vowelCount(left);
        int rightCount = vowelCount(right);
        return (leftCount == rightCount);


    }
    private static int vowelCount(String sl) {
        int vc = 0;
        for(int i = 0; i< sl.length(); i++) {
            char thiss = sl.charAt(i);
            if(thiss == 'a' || thiss == 'e' || thiss == 'i' || thiss == 'o' || thiss == 'u') {
                vc++;
            }
        }
//        System.out.println("vowel count " + vc);
        return vc;
    }
}
