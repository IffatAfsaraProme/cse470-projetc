package restaurantsystem.UnitTest;

public class calculate {

    int total;
    int total1;
    public int addNumber(int item1,int item2){
        return total = item1 + item2;
    }
    public int removeNumber(int itemA,int itemB){
        return total1 = itemA - itemB;
    }
    public String addString(String j, String k){
        return j+k;
    }

    public double vat(double totalBill) {
        return totalBill*0.15;
    }

}
