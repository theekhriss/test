//package com.pf.ingreso;
//
//import com.pf.ingreso.modelo.Persona;
//import com.pf.ingreso.repository.PersonaRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = IngresoApplication.class)
//class IngresoApplicationTests {
//
//    @Resource
//    private PersonaRepository personaRepository;
//
//    @Test
//    public void givenStudent_whenSave_thenGetOk() {
//        Persona student = new Persona("claudio", "miranda", "pizarro", 1, "casa",
//                "111111111-1", "", 1, " String per_f_ingreso", " String per_f_modificar",
//                "String per_correo");
//        Persona guardado = personaRepository.save(student);
//        System.out.println(student.toString());
//        System.out.println(guardado.toString());
//        List<Persona> personas = personaRepository.findPersonaByPer_rut("111111111-1");
//        System.out.println(personas.size());
//    }
//
//}