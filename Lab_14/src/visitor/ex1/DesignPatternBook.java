package visitor.ex1;

public class DesignPatternBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "Design Pattern Book";

    }

    public String getBestSeller() {
        return "NSB";
    }

}
