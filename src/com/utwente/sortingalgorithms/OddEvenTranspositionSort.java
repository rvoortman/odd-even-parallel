package com.utwente.sortingalgorithms;

import com.utwente.SortInterface;

public class OddEvenTranspositionSort implements SortInterface{

    @Override
    public int[] sort(int[] array) {
        return new int[0];
    }

    private void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
