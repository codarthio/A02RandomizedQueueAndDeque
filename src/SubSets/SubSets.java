/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubSets;

import java.util.ArrayList;

/**
 *
 * @author Cody Henry
 */
public class SubSets {
    public static void main(String[] args){
        ArrayList p = newPainterSet();
        ArrayList subsetA = newSubset("Baroque", p);
        ArrayList subsetB = newSubset("Renaissance", p);
        System.out.println("Universal Set: "  + p);
        System.out.println("\nSubset A: " + subsetA);
        System.out.println("\nSubset B: " + subsetB);
        complementOf(subsetA, p);
        unionOf(subsetA, subsetB);
        intersectionOf(subsetA, subsetB);
        differenceOf(subsetA, subsetB);
        symmetricDifferenceOf(subsetA, subsetB);
    }
    
    public static ArrayList newPainterSet(){

        ArrayList p = new ArrayList ();
        p.add(new Painter("Michelangelo", 1475));
        p.add(new Painter ("Raphael", 1483));
        p.add(new Painter ("Donatello", 1386));
        p.add(new Painter ("Carvaggio", 1571));
        p.add(new Painter ("Gian Lorenzo Bernini", 1598));
        p.add(new Painter ("Rembrandt", 1606));
        p.add(new Painter ("Francisco de Goya", 1746));
        p.add(new Painter ("Jean-Honore Fragonard", 1732));
        p.add(new Painter ("Francois Boucher", 1703));
    
        return p;
    }
    
    public static ArrayList newSubset(String period, ArrayList p){
        Painter painterP;
        ArrayList subset = new ArrayList();
        for(int i = 0; i < p.size() -1; i++){
            
            painterP = (Painter) p.get(i);
            if(period == painterP.getPeriod() || painterP.getPeriod() == "Rococo"){
                subset.add(painterP);
            }
        }
        return subset;
    }
    public static void complementOf(ArrayList subset, ArrayList universalSet){
        
        for(int i = 0; i < subset.size() - 1; i++){
            universalSet.removeAll(subset);
        }
        System.out.println("\nComplement of A: " + universalSet);
    }
    public static void unionOf(ArrayList subsetA, ArrayList subsetB){
        ArrayList unionSet = new ArrayList();
        
        for(int i = 0; i < subsetA.size() -1; i ++){
            if(!unionSet.contains(subsetA.get(i))){
            unionSet.add(subsetA.get(i));
            }
        }
        for(int i = 0; i < subsetB.size() - 1; i++){
           if(!unionSet.contains(subsetB.get(i))){
            unionSet.add(subsetB.get(i));
            }
        }
        System.out.println("\nUnion of A and B: " + unionSet);
    }
    public static void intersectionOf(ArrayList subsetA, ArrayList subsetB){
        ArrayList complementSet = new ArrayList();
        if(subsetA.size() > subsetB.size()) {
            for(int i = 0; i < subsetB.size(); i++){
                if(subsetA.contains(subsetB.get(i))){
                    complementSet.add(subsetB.get(i));
                }
            }
        } else {
            for(int i = 0; i < subsetA.size(); i++){
                if(subsetB.contains(subsetA.get(i))){
                    complementSet.add(subsetA.get(i));
                }
            }
        }
        System.out.println("\nIntersection of A and B: " + complementSet);
    }
    public static void differenceOf(ArrayList subsetA, ArrayList subsetB){
        ArrayList differenceSet = new ArrayList();
       
            for(int i = 0; i < subsetB.size(); i++){
                if(!subsetA.contains(subsetB.get(i))){
                    differenceSet.add(subsetA.get(i));
                }
            }
        System.out.println("\nDifference of A and B: " + differenceSet);
        
    }
    public static void symmetricDifferenceOf(ArrayList subsetA, ArrayList subsetB){
        ArrayList symmetricSet = new ArrayList();
        
        for(int i = 0; i < subsetA.size() - 1; i++){
            if(!subsetB.contains(subsetA.get(i))) symmetricSet.add(subsetA.get(i));
            
            if(!subsetA.contains(subsetB.get(i))) symmetricSet.add(subsetB.get(i));
        }
        
        System.out.println("\nSymmetric Difference of A and B: " + symmetricSet);
    }
}
