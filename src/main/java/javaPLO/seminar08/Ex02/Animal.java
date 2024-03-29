package javaPLO.seminar08.Ex02;
// Создать классы Собака, Кот, Домашний Кот, Тигр, Животное
// Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
// У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание: кот — не умеет плавать,
// собака — 10 м). Результатом выполнения действия будет печать в консоль.
// Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
// Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть.
// Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
public abstract class Animal {
    static int count;
    String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
