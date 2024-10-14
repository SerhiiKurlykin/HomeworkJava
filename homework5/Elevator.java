package homeWork.homework5;
// Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//Лифт сломан.
//Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
//Найдите количество подъемов, которые понадобятся лифту.
//Ввод:
//H = 200, N = 50, M = 1
//Ответ: 5
//Объяснение:
//Первый подъем: 50 - 1 = 49
//Второй подъем: 49 + 50 - 1 = 98
//Третий подъем: 98 + 50 - 1 = 147
//Четвертый подъем: 147 + 50 - 1 = 196
//Пятый подъем: выйти за пределы H.
//
//
//Реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
public class Elevator {
    public static void main(String[] args) {
        int H = 200;
        int N = 50;
        int M = 1;


        int lifts = numberOfLifts(H, N, M);
        System.out.println("Количество подъемов: " + lifts);
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int currentFloor = 0;
        int lifts = 0;


        while (currentFloor < floor) {
            lifts++;
            currentFloor = currentFloor + stepUp;


            if (currentFloor >= floor) {
                break;
            }

            currentFloor = currentFloor - stepDown;
        }

        return lifts;
    }
}


