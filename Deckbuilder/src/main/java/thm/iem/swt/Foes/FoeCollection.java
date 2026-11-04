package thm.iem.swt.Foes;

public class FoeCollection {

    public void initFoes() {
        FoeActor Wolf = new FoeActor("Wolf", 1, 150);
        FoeActor Bear = new FoeActor("Bear", 2, 250);
        FoeActor Skeleton = new FoeActor("Skeleton", 3, 100);
        FoeActor Witch = new FoeActor("Witch", 4, 80);
    }
}
