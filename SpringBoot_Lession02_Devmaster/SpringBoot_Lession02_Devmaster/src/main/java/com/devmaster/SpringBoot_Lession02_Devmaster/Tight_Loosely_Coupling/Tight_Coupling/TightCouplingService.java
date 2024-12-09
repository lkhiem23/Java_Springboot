package com.devmaster.SpringBoot_Lession02_Devmaster.Tight_Loosely_Coupling.Tight_Coupling;

import java.util.Arrays;

public class TightCouplingService{
    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

    public TightCouplingService(){

    }

    public TightCouplingService(BubbleSortAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }


    public void complexBusinessSort(int[] array){
        bubbleSortAlgorithm.sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void main(String[] args) {
        TightCouplingService tightCouplingService = new TightCouplingService();
        tightCouplingService.complexBusinessSort(new int[] {1,2,3,4,5,6,7,8,9});
    }
}
