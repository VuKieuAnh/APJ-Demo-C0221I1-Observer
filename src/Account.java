import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {
    private String name;
    private List<Observer> observerList = new ArrayList<>();

    public List<Observer> getObserverList() {
        return observerList;
    }

    public Account(String name) {
        this.name = name;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notification(String mess, Subject a) {
        //nghiệp vụ
        System.out.println(name);
        for (Observer ob: observerList
             ) {
            ob.update(mess);
        }
        System.out.println(((Account) a).name);
        for (Observer o: ((Account) a).getObserverList()
             ) {
            o.update(mess);
        }
    }
}