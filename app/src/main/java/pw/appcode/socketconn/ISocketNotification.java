package pw.appcode.socketconn;

public interface ISocketNotification {
    /**
     * Обработчик сообщений
     * @param type тип сообщения
     * @param buffer сообщение
     */
    void onNotificationMessage(String type, String buffer);

    /**
     * Обработчик. Сообщение доставлено
     * @param buffer сообщение
     */
    void onNotificationDelivered(String buffer);

    /**
     * Обработчик. Сообщение не доставлено
     * @param buffer сообщение
     */
    void onNotificationUnDelivered(String buffer);
}
