package thm.iem.swt.Foes;

import java.util.ArrayList;

public class FoePool {

    private static ArrayList<Integer> idList = new ArrayList<Integer>();

    // method deprecated, foe objects should be created on demand, so multiple instances of the same foes are possible
//    public void initBasicFoes() {
//        FoeActor Wolf = new FoeActor("Wolf", 1, 150);
//        FoeActor Bear = new FoeActor("Bear", 2, 250);
//        FoeActor Skeleton = new FoeActor("Skeleton", 3, 100);
//        FoeActor Witch = new FoeActor("Witch", 4, 80);
//    }

    public int findId() {
        int i, newId = 1;
        for (i = 0; i < idList.size(); i++) {
            if (idList.get(i) == newId) {
                newId++;
            }
        }
        return newId;
    }

    public void disposeFoe(FoeActor foe) {
        int i;
        for (i = 0; i < idList.size(); i++) {
            if (idList.get(i) == foe.getId()) {
                idList.remove(i);
            }
        }
        foe = null;     // referenz verwerfen => garbage collector
    }

    public FoeActor spawnWolf() {
        FoeActor wolf = new FoeActor("Wolf", findId(), 150);
        //wolf.receiveBuff();       // hier können bestimmte gegner von beginn an mit bestimmten buffs spawnen
        //wolf.addAttackEffect();   // hier können spezifischen gegener spezifische attacken zugeordnet werden
                                    // (letztendlich auch einfach *karteneffekte*)
        return wolf;
    }

    public FoeActor spawnBear() {
        FoeActor bear = new FoeActor("Bear", findId(), 250);
        return bear;
    }

    public FoeActor spawnSkeleton() {
        FoeActor skeleton = new FoeActor("Skeleton", findId(), 100);
        return skeleton;
    }

    public FoeActor spawnWitch() {
        FoeActor witch = new FoeActor("Witch", findId(), 80);
        return witch;
    }

    public FoeActor spawnGoblin() {
        FoeActor goblin = new FoeActor("Goblin", findId(), 50);
        return goblin;
    }

    public FoeActor spawnSteffen() {
        FoeActor steffen = new FoeActor("Steffen, Zerstörer von Welten", findId(), 99999);
        return steffen;
    }
}
