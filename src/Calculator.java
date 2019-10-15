public class Calculator {
    public  float calculator(float number_one , float number_two, char operator ){
        switch(operator){
            case '+':
                return number_one +number_two;
            case '-' :
                return number_one -number_two;
            case '*' :
                return number_one*number_two;
            case '/' :
                if(number_one !=0){
                        return number_one/number_two;

                }else{
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new RuntimeException("invalid operation");

        }

    }
}
