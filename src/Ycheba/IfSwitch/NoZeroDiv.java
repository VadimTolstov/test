package Ycheba.IfSwitch;


//absval = val < 0 ? -val : val; это равняется выражению ниже
//if(val < 0) absval = -val;
//else absval = val;

/* if(х < 0) у = 10; равняется выражению ниже
        else у = 20;
        Ответ:
        у = х < О ? 10 : 20; */

// Предотвращение деления на нуль с помощью оператора ?
class NoZeroDiv {
    public static void main(String args[]) {
        int result;
        for (int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0; //Деление на нуль предотваращается !=0
                                           // и пресваивается 0 result
            if (i != 0)
                System.out.println("100 / " + i + " равно " + result);
        }
    }

}
