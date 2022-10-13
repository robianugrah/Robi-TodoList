public class ApliklasiTodoList {

  //hello there Agung was here
  //Mwehehehehe

    public static String[]model = new String[10];
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    private static boolean channel;
    
    
    public static void main(String[] args) {
      //untuk tes silahkan hapus garingnya
      //testShowTodoList();
      //testAddTodoList();
      //testRemoveTodoList();
      //testInput();
      testViewShowTodoList();
 
    }
    public static void showTodoList(){
      for (int i = 0; i<model.length;i++){
          String todo = model[i];
          int no = i+1;
          
          if(todo!=null){
              System.out.println(no+"."+todo);
          }
      }
    }
    public static void testShowTodoList(){
        showTodoList();
    }
    public static void addTodoList(String todo){
     Boolean isFull = true;
        for (String model1 : model) {
            if (model1 == null) {
                isFull = false;
                break;
            }
        }
     if (isFull){
         String[] temp = model;
       model = new String[model.length * 2];
       //System.arraycopy(temp, 0, model, 0, temp.length);
     }
     for(int i = 0; i < model.length; i ++){
      if (model[i] == null){
          model[i] = todo;
          break;
      }   
     }
    }
    public static void testAddTodoList(){
      for (int i = 1; i < 30; i++){
          addTodoList("Contoh Todo Ke : " + i);
      }  
        showTodoList();
    }
    public static boolean removeTodoList(Integer number){
    if ((number -1) >= model.length){
      return false;  
    } else if(model[number - 1] == null){
      return false;  
    } else {
      for (int i = (number - 1); i < model.length; i++){
      if(i == (model.length - 1)){
        model[i] = null;  
      }  else{
         model[i] = model[i + 1]; 
      }
    } 
     return true; 
    }  
  }
    public static void testRemoveTodoList(){
    addTodoList("satu");    
    addTodoList("Dua");    
    addTodoList("Tiga");    
    addTodoList("Empat");    
    addTodoList("Lima");
    
    Boolean result = removeTodoList(20);
    System.out.println(result);
    
    result = removeTodoList(7);
    System.out.println(result);
   
    result = removeTodoList(2);
    System.out.println(result);
    showTodoList();
    }
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    public static void testInput(){
      String name = input("Nama");
      System.out.println("Hi " + name);
      
      String channel = input("Channel");
      System.out.println(name + " "  + channel);      
    }
    public static void removeTodoList(){
        
        
    }
    public static void viewShowTodoList(){
      while (true){
        showTodoList();
      
        System.out.println("Menu : ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. Keluar");
        
        String input = input("Pilih");
        if (input.equals("1")){
            viewAddTodoList();
        }else if(input.equals("2")){
            viewRemoveTodoList();
        }else if(input.equals("x")){
            break;
        }else{
            System.out.println("Pilihan tidak dimengerti");
        }
      }  
    }
    public static void testViewShowTodoList(){
    addTodoList("satu");    
    addTodoList("Dua");    
    addTodoList("Tiga");    
    addTodoList("Empat");    
    addTodoList("Lima");
    viewShowTodoList(); 
    }
    public static void viewaddTodoList(){
        
    }
    public static void viewremoveTodoList(){
        
    }
       
public static void testviewShowTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    addTodoList("Empat");
    addTodoList("Lima");
    viewAddTodoList();
  }
  
  public static void viewAddTodoList() {
    System.out.println("Menambah ToDo List");
    String todo = input("Todo (x Jika Batal)");
    if (todo.equals("x")) {
    } else {
      addTodoList(todo);
    }
  }

  public static void testviewAddTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
  
    viewaddTodoList();
    showTodoList();
  }
  
  public static void viewRemoveTodoList() {
    System.out.println("Menghapus ToDo List");
    String number = input("Nomor yang Dihapus (x Jika Betul)");
    if (number.equals("x")) {
      
    } else {
      boolean succes = removeTodoList(Integer.valueOf(number));
      if (!succes) {
        System.out.println("Gagal Menghapus ToDO List : " + number);
      }
    }
  }
  
  public static void testviewRemoveTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    showTodoList();
    viewRemoveTodoList();
    showTodoList();
  } 

    // private static void viewAddTodoList() {
    //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    // }

    // private static void viewRemoveTodoList() {
    //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    // }
}