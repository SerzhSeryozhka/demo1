package com.example.demo1;

import java.util.Objects;
import java.util.Scanner;

public class BuMost {
    int kolvo;
    double height;

    public BuMost(int kolvo, double height) {
        this.kolvo = kolvo;
        this.height = height;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String makeSequence(){
        Scanner scanner=new Scanner(System.in);
        try {
        kolvo = scanner.nextInt();
        int count=1;
        for (int i=0; i<kolvo; i++){
            height=scanner.nextDouble();
          if (height<=437)
              return "Crash! "+count;
          else
              count++;
          return "No crash! ";

        }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public String toString() {
        return "BuMost{" +
                "kolvo=" + kolvo +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuMost buMost = (BuMost) o;
        return kolvo == buMost.kolvo && Double.compare(height, buMost.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kolvo, height);
    }
}
