package Assignment;

public class Assignment4 {
    public static void main(String[] args) {
        int a[] = { 5, -2, 6, 3, 9 };
        ArrSort a1 = new ArrSort();
        a1.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

class ArrSort {
    public void sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
