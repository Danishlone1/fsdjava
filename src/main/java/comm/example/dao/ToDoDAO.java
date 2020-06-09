package comm.example.dao;

import comm.example.model.ToDo;

import java.util.List;


    import java.util.List;

    public interface ToDoDAO {
        public List<ToDo> getToDo();
        public void createToDo(ToDo todo);
        public ToDo geToDo(int todoId);
        public  void deleteToDo(int todoId);
    }


