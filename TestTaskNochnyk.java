package MyStuff.Problems;

public class TestTaskNochnyk {

    // Initializing three constants describing number of likes from 1 to 3:

    private static final int ONE_LIKE = 1;
    private static final int TWO_LIKES = 2;
    private static final int THREE_LIKES = 3;
    private static final int OTHERS = 2;

    // Implementation of getLikes() method:

    public static void getLikes(String[] inputArray) {

        // The condition checking if the array is empty:

        if (inputArray[0].isEmpty()){
            System.out.println("no likes for this post");
        }

        // The condition checking if there's duplicate names in the array:

        else if (inputArray[0].equals(inputArray[1])){
            System.out.println(inputArray[0] + " like this post");
        }

        switch (inputArray.length){

            // The condition checking if there's one person likes this post

            case ONE_LIKE:
                System.out.println(inputArray[0] + " likes this post");
                break;

            // The condition checking if there's two persons like this post taking into account
            // possible duplication of names:

            case TWO_LIKES:
                for (int i = 0; i < inputArray.length; i++){
                    for (int j = i+1; j < inputArray.length; j++){
                        if (inputArray[i].equals(inputArray[j])){
                            return;
                        }}}
                System.out.println(inputArray[0] + " and " + inputArray[1] + " like this post");
                break;

            // The condition checking if there's three persons like this post taking into account
            // possible duplication of names:

            case THREE_LIKES:
                for (int i = 0; i < inputArray.length; i++){
                    for (int j = i+1; j < inputArray.length; j++){
                        if (inputArray[i].equals(inputArray[j])){
                            return;
                        }}}
                System.out.println(inputArray[0] + ", " + inputArray[1] + " and " + inputArray[2] + " like this post");
                break;
        }

        // The condition checking if there's more than 3 people like this post:

        if (inputArray.length == OTHERS + 1){
            return;
        }
        else if (inputArray.length > OTHERS){
            System.out.println(inputArray[0] + ", " + inputArray[1] + " and " + (inputArray.length - OTHERS) +
                    " others like this post");
        }
    }

    // Method 'main' where initializing of the array occurs:

    public static void main(String[] args) {

    // Initializing of the array:

        String[] inputArray = {"Alex", "Jacob", "Mark", "Max"};

    // Compiling of getLikes() method with an array passed as an argument:

        getLikes(inputArray);
    }
}

