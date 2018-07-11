package java.ru.job4j.Start;

import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Переменная принимающая рандомное значение для создания id заявки
     */
    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId(){
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Метод проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null..
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Найденный Item.
     */
    protected Item findById(String id){
        Item result = null;
        for (Item item: items) {
            if (item != null && item.getId().equals(id)){
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findAll(){
        Item[] result = new Item[100];
        for (int i = 0; i < items.length && items[i] != null; i++) {
            result[i] = items[i];
        }
        return result;
    }

    public void delete(String id){
        for (Item item: items) {
            if (item.getId().equals(id)) {
                System.arraycopy (items, this.position + 1, items, this.position,  items.length - this.position);
                break;
            }
        }
    }

    public Item[] findByName(String key){
        Item[] result = new Item[100];
        int i = 0;
        for (Item item: items) {
            if (item.getName().equals(key)){
                result[i] = item;
                i++;
            }
        }
        return result;
    }

    public void replace(String id, Item item){
        for (int i = 0; i < items.length && items[i] != null; i++) {
            if (.equals(id)) {
                items[i] = item;
            }
        }
    }
}