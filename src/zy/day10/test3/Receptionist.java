package zy.day10.test3;

public class Receptionist {
   private Filter filter;

    public Receptionist() {
    }

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void setUserType(User user){
        if (filter!=null){
            filter.filterUser(user);
        }
        if (null==user.getType()){
            user.setType("A");
        }
    }
}
