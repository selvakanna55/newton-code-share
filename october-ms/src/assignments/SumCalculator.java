package assignments;// create class here and its methods as well

class SumCalculator {
    int num1;
    int num2;

    SumCalculator(int calNum1, int calNum2) {
        num1 = calNum1;
        num2 = calNum2;
    }

    int sum() {
        return num1 + num2;
    }

    int sum2(int a, int b) {
        return a + b;
    }

    int fromObject(SumCalculator obj1, SumCalculator obj2) {
        return obj1.sum() + obj2.sum();
    }

}