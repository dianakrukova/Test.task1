package org.example;

public class Win {
    public static int winners(int x, int y, int z) {
        int max = Integer.max(x,y);
        int min = Integer.min(x,y);

        if(max < z) {             // счет не дошел до z
            if (max - min >= 2){
                return z - max;  // один игрок заметно опережает другого, т.е. для выигрыша нужно первому дойти до z
            }else {             // разница у игроков 0 или 1 очко
                if(z - min < 2) {   // первый в 1 очке от z, второй отстает на 0 или 1
                    return (z - max) + (2 -(z-min)); //// z-max (=1) - сколько победителю осталось до z. а (2-(z-min)) - добавка, если второй будет отставать менее, чем на 2 очка, когда первый наберет z
                }else {     // первый в 1 очке от z, второй отстает на >2 очка
                    return z - max;
                }
            }
        } else {   // счет дошел (превысил) z, значит, max-man<2, значит для выигрыша нужно довести разницу до 2
            return 2 - (max - min);
        }
    }
}
