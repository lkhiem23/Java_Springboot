package com.devmaster.SpringBoot_Lession02_Devmaster.Tight_Loosely_Coupling.LooselyCouped;

import java.util.Arrays;

interface SortAlgorithm {
    void sort(int[] array);
}

class LooselyBubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        System.out.println("Sắp xếp theo giải thuật BubbleSort:");
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            System.out.println("Kết quả sau vòng lặp " + (i + 1) + ": " + Arrays.toString(array));
        }
    }
}

class LooselyCoupedService {
    private SortAlgorithm sortAlgorithm;

    public LooselyCoupedService(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void complexBusiness(int[] array) {
        sortAlgorithm.sort(array);
    }

    public static void main(String[] args) {
        // Khởi tạo dịch vụ với thuật toán sắp xếp BubbleSort
        LooselyCoupedService service = new LooselyCoupedService(new LooselyBubbleSortAlgorithm());
        int[] data = {5, 4, 2, 6, 11, 10, 20, 19, 8};

        // Gọi phương thức xử lý
        service.complexBusiness(data);

        // In kết quả cuối cùng
        System.out.println("Kết quả cuối cùng: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
