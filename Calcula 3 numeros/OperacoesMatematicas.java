public class OperacoesMatematicas {

    double numero1;
    double numero2;
    double numero3;


    OperacoesMatematicas (double num1, double num2, double num3){
    numero1 = num1;
    numero2 = num2;
    numero3 = num3;

    }

    double soma(double num1, double num2, double num3){

        return num1 + num2 + num3;

    }

    double media(double num1, double num2, double num3){

        return (num1 + num2 + num3)/3;

    }

    double subtrai(double num1, double num2, double num3) {

        return num1 - num2 - num3;
    }

    double multiplica(double num1, double num2, double num3) {

        return num1 * num2 * num3;

    }

    double maior(double num1, double num2, double num3) {

        if(num1 > num2 && num1 > num3){

            return num1;

        }else if(num2 > num1 && num2 > num3){

            return num2;

        }else{

            return num3;

        }
    }
}



