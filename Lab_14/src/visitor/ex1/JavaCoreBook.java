package visitor.ex1;

public class JavaCoreBook implements ProgramingBook{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "Java Core Book";
    }
    public String getFavouriteBook(){
        return "Learn code java basic";
    }
}
