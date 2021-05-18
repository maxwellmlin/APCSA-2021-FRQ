public class CombinedTable {
  private int numSeats;
  private SingleTable t1;
  private SingleTable t2;

  public CombinedTable(SingleTable t1, SingleTable t2) {
    this.t1 = t1;
    this.t2 = t2;

    numSeats = t1.getNumSeats() + t2.getNumSeats() - 2;
  }

  public boolean canSeat(int num) {
    return num <= numSeats && num >= 0;
  }

  public double getDesirability() {
    double desirability;

    if (t1.getHeight() == t2.getHeight()) {
      desirability = (t1.getViewQuality() + t2.getViewQuality()) / 2;
    } else {
      desirability = ((t1.getViewQuality() + t2.getViewQuality()) / 2) - 10;
    }

    return desirability;
  }
}
