public class csExercise {
    public static void main(String[] args) {
        SingleTable table1=new SingleTable(4, 60, 74);
        SingleTable table2=new SingleTable(8, 70, 74);
        SingleTable table3=new SingleTable(12, 75, 76);
        CombinedTable combinedTable1=new CombinedTable(table1, table2);
        System.out.println(combinedTable1.canSeat(9));
        System.out.println(combinedTable1.canSeat(11));
        System.out.println(combinedTable1.quality());
        CombinedTable combinedTable2=new CombinedTable(table2, table3);
        System.out.println(combinedTable2.canSeat(18));
        System.out.println(combinedTable2.quality());
        table2.setQuality(80);
        System.out.println(combinedTable2.quality());
        CombinedTable combinedTable3 = new CombinedTable(table1,table3);
        System.out.println(combinedTable3.quality());


    }
}
class SingleTable {
    private int seat;
    private double quality;
    private int height;

    public SingleTable(int seat, double quality, int height) {
        this.seat = seat;
        this.quality = quality;
        this.height = height;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


class CombinedTable{
    private SingleTable t1;
    private SingleTable t2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public boolean canSeat(int count){
        if (count< t1.getSeat()+t2.getSeat()){
            return true;
        }
        else{
            return false;
        }

    }
    public double quality(){
        if (t1.getHeight()==t2.getHeight()){
            return (t1.getQuality()+t2.getQuality())/2;
        }
        else{
            return ((t1.getQuality()+t2.getQuality())/2)-10;
        }
    }


}