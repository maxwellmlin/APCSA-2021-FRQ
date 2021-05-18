public class ArrayResizer {
  public static int numNonZeroRows(int[][] array2D) {
    int count = 0;
    for (int i = 0; i < array2D.length; i++) {
      if (isNonZeroRow(array2D, i)) {
        count++;
      }
    }

    return count;
  }

  public static boolean isNonZeroRow(int[][] array2D, int r) {
    for (int i = 0; i < array2D[0].length; i++) {
      if (array2D[r][i] == 0) {
        return false;
      }
    }

    return true;
  }

  public static int[][] resize(int[][] array2D) {
    int[][] newArr = new int[numNonZeroRows(array2D)][array2D[0].length];
    int row = 0;

    for (int i=0; i<array2D.length; i++) {
      if (isNonZeroRow(array2D, i)) {
        newArr[row] = array2D[i];
        row++;
      }
    }

    return newArr;
  }
}