package javaPLO.seminar13.ex02;

// Наблюдатель, он будет получать уведомления
// В данном случае это человек, ищущий работу, получает уведомления от рекрутинговского агенства
public interface Observer {
    void receiveOffer(String nameCompany, int salary);
}
