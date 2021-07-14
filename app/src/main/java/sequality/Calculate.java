package sequality;

public class Calculate {
  public static int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int allsum(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public double sumave(int x, int y) {
    int sum = 0;
    int cnt = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
      cnt++;
    }
    return (double) sum / cnt;
  }

  public boolean codd(int x) {
    if (x % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }

  public int sumodd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (codd(i) == true) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumeven(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (codd(i) == false) {
        sum += i;
      }
    }
    return sum;
  }


}
