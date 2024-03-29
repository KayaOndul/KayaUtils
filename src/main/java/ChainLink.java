enum Side {NONE, LEFT, RIGHT}

public class ChainLink {
    private ChainLink left, right;

    public void append(ChainLink rightPart) {
        if (this.right != null)
            throw new IllegalStateException("Link is already connected.");

        this.right = rightPart;
        rightPart.left = this;
    }

    public Side longerSide() {
        ChainLink hold = this;
        int counterRight = 0;
        int counterLeft=0;

        while (hold.right != null) {
            counterRight++;
            hold = hold.right;
            if (this.equals(hold)){
                return Side.NONE;
            }
        }

        hold = this;

        while (hold.left != null) {
            counterLeft ++;
            hold = hold.left;
            if (this.equals(hold)){
                return Side.NONE;
            }
        }
        if (counterRight > counterLeft){
            return Side.RIGHT;
        }else if(counterLeft>counterRight){
            return Side.LEFT;
        }
        return Side.NONE;
    }

    public static void main(String[] args) {
        ChainLink left = new ChainLink();
        ChainLink middle = new ChainLink();
        ChainLink right = new ChainLink();
        left.append(middle);
        middle.append(right);
        System.out.println(left.longerSide());
    }
}