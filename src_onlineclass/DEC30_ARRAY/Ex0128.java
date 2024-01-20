package src_onlineclass.DEC30_ARRAY;

public class Ex0128 {
    public static void main(String[] args) {

        String name = "Pavithra";
        char [] charArray = name.toCharArray();
        System.out.println(Character.LETTER_NUMBER);

        int left =0;
        int right = charArray.length-1;

        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        String rev_name = new String(charArray);
        System.out.println(rev_name);


    }
}
