package forrest.service;

import forrest.domain.Owl;
import forrest.domain.PineTree;
import forrest.domain.Squirrel;

import java.util.ArrayList;

public interface ForrestService {

    public PineTree createPineTree(int treeAge, int numOfCones, ArrayList<Squirrel> squirrels, Owl owl);

    public Squirrel createSquirrel(int weight, boolean hungry, int age, int numOfConesInNest);

    public Owl createOwl(int weight, boolean hungry, int age, int wingSpan, int amountSquirrels);

}
