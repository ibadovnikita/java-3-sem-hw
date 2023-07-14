import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class homework_3 {
    public static void main(String[] args) {
        List<Integer> list = createList(10, 1, 15);
        System.out.println(list);
        //List<Integer> list2 = deleteEven(list);
        int maxElement = Collections.max(list);
        int minElement = Collections.min(list);
       System.out.println("Минимальное число -> "+min_number(list));  
       System.out.println("Минимальное число через колектион способ -> "+minElement);
       System.out.println("Максимальное число -> "+max_number(list));
       System.out.println("Максимальное число через колектион способ -> "+maxElement);
       System.out.println("Среднее значение -> "+Math.round(average_number(list) * 100.0) / 100.0);
       // System.out.println(list2);
        
    
}   


// создаем лист с случайными цел значениями
static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for(int i = 0; i<size; i++){
            list.add((int)(Math.random()*(max-min+1)+min));
        }
        return list;
    }

   // 1) Нужно удалить из него чётные числа
static List<Integer> deleteEven(List<Integer> example)
{
    for(int i = 0; i<example.size(); i++){
        if(example.get(i)%2==0){
            example.remove(i);
            i--;
        }
    }



    return example;
}

  // 2) Найти минимальное значение
  static Integer min_number(List<Integer> example)
  {
    
    int min = example.get(0);
    for(int i = 0; i<example.size(); i++){
        int currentElement = example.get(i);
        if(currentElement<min){
            min=currentElement;
            
        }
    }

    


    return min;
  }

// 3) Найти максимальное значение

static Integer max_number(List<Integer> example)
  {
    
    int max = example.get(0);
    for(int i = 0; i<example.size(); i++){
        int currentElement = example.get(i);
        if(currentElement>max){
            max=currentElement;      
        }
    }
    return max;
  }
  
  //Найти среднее значение
  static Double average_number(List<Integer> example)
  {
    
    double avg = 0;
    for(int i = 0; i<example.size(); i++){
        avg+=example.get(i);
    }
    avg = avg/example.size();
    return avg;
  }




}





