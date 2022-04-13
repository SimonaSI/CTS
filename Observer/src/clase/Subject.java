package clase;

import client.Observer;

public interface Subject {
    public void aboneaza(Observer observer);
    public void dezaboneaza(Observer observer);
    public void notifica(String mesaj);

}
