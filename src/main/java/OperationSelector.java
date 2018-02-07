public class OperationSelector {


    public int sumFrom1ToUserInput(int number) {

        int result = 0;

        for(int i = 0; i <= number;i++){
            result+= i;
        }
        return result;
    }

    public int sumFrom1ToUserInput2(int number){
        int result = 0;
        int i = 1;

        while(result <= number){
            result+= i;
            i++;
        }
        return result;
    }

    public int productFrom1ToUserInput(int number) {

        int result = 1;

        for(int i = 1; i <= number;i++){
            result*= i;
        }
        return result;
    }

}
