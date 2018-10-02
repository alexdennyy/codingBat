public class codingBat {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(vacation){
            return true;
        }
        if(!weekday){
            return true;
        }
        if(weekday && !vacation){
            return false;
        }
        return false
                ;
    }

    public String helloName(String name) {
        return ("Hello " + name +"!");
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {

        if(isBirthday){
            speed -= 5;
        }
        if(speed <= 60){
            return 0;
        } if(speed > 60){
            if(speed <= 80){
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    public boolean commonEnd(int[] a, int[] b) {
        boolean common = false;
        int aLength = a.length - 1;
        int bLength = b.length - 1;
        if(a[0] == b[0]){
            common = true;
        }
        if(a[aLength] == b[bLength]){
            common = true;
        }
        return common;
    }

    public String stringTimes(String str, int n) {
        String string = "";
        for(int i = 0; i < n; i++){
            string += str;
        }
        return string;
    }
    public String mixString(String a, String b) {
        int length = 0;
        String newString = "";
        if(a.length() >= b.length()){
            length = a.length();
        } else {
            length = b.length();
        }
        for(int i = 0; i < length; i++){
            if(a.length() > i){
                newString += a.charAt(i);
            }
            if(b.length() > i){
                newString += b.charAt(i);
            }
        }
        return newString;
    }

    public boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                has1 = true;
            }
            if(nums[i] == 4){
                has4 = true;
            }
        }
        if(has4 && has1){
            return false;
        } else {
            return true;
        }
    }

    public boolean canBalance(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int leftSide = 0;
            int rightSide = 0;
            for(int k = 0; k < i; k++){
                leftSide += nums[k];
            }
            for(int l = 0; l < nums.length - i; l++){
                rightSide += nums[l + i];
            }
            if(rightSide == leftSide){
                return true;
            }
        }
        return false;
    }

    public int close10(int a, int b) {
        int aNew = Math.abs(a - 10);
        int bNew = Math.abs(b - 10);
        if(aNew > bNew){
            return b;
        }
        if(aNew < bNew){
            return a;
        }
        if(bNew == aNew){
            return 0;
        }
        return 0;
    }

    public String extraFront(String str) {
        String newStr = "";
        if(str.length() == 0){
            return newStr;
        }
        if(str.length() < 2){
            newStr += str.substring(0, 1);
            newStr += str.substring(0, 1);
            newStr += str.substring(0, 1);
        } else {
            for(int i = 0; i < 3; i++){
                newStr += str.substring(0, 2);
            }
        }
        return newStr;
    }

}
