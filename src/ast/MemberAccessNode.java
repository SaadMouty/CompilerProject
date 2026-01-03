package ast;

public class MemberAccessNode extends AstNode {
    private String objectName; // product
    private String memberName; // name

    public MemberAccessNode(String objectName, String memberName, int lineNumber) {
        super("MEMBER_ACCESS", lineNumber);
        this.objectName = objectName;
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Access: " + objectName + "." + memberName + " [Line: " + lineNumber + "]";
    }
}