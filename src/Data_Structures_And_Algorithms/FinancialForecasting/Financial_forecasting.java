package Data_Structures_And_Algorithms.FinancialForecasting;

public class Financial_forecasting {
    public static double predict(double presentVal,double growthRate,int time){
        if(time==0){
            return presentVal;
        }
        presentVal*=(1+growthRate);
        time--;
        return predict(presentVal,growthRate,time);
    }

    public static void main(String[] args) {
        double presentVal=20000;
        double growth=0.05;
        int time=10;
        System.out.println("The future value of "+presentVal+ " after "+time+" years will be "+predict(presentVal,growth,time));
    }
}
