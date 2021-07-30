import java.util.*;

public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        Set<String> visited = new HashSet<>();
        Queue<Friend> queue = new ArrayDeque<>();
        queue.add(this);
        visited.add(this.email);

        while(!queue.isEmpty()){
            Friend current = queue.poll();
            if(current.email.equals(friend.email)){
                return true;
            }
            for(final Friend next: current.friends)
                if(visited.add(next.email))
                    queue.add(next);
        }
        return false;



    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}