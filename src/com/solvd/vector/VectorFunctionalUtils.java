package com.solvd.vector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class VectorFunctionalUtils implements Comparator<Vector> {


    public static List<TriCoordVector> generate (int n, Supplier<Integer> intSupplier)
    {
        Random r = new Random(0);
        List<TriCoordVector> vectors = new ArrayList<>();
        vectors.add(new TriCoordVector(r.nextInt(),r.nextInt(),r.nextInt()));
        return vectors;
    }

    @Override
    public int compare(Vector o1, Vector o2) {
        double thisLength = o1.getLength();
        double thatLength = o2.getLength();
        return Double.compare(thisLength, thatLength);
    }


    public void sort (Comparator<Vector> vectorComparator, List<Vector> vectorList) {
        List<TriCoordVector> vectors = new ArrayList<>();
        vectors.stream()
                .sorted(vectorComparator)
                .collect(Collectors.toList());

    }
}
