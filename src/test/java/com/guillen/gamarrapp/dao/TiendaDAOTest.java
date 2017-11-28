package com.guillen.gamarrapp.dao;

import static org.junit.Assert.fail;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.model.Tienda;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class TiendaDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(TiendaDAOTest.class);

	@Autowired
	private TiendaDAO tiendaDAO;


	@BeforeClass
	public static void beforeClass() {
		logger.info("Antes de todos los metodos");
	}
	
	@Before
	public  void before() {
		logger.info("Antes de cada metodo");
	}

	@Test
	public void testFindEmployeeById() {

		try {
			//
			Tienda tda = tiendaDAO.findTienda(0000000006);

			Assert.assertNotNull(tda);

			Assert.assertEquals("Galeria Azul", tda.getNombre());
			Assert.assertEquals(991991991, tda.getTelefono());
			Assert.assertEquals("-12.063824839080928", tda.getLatitud());
			Assert.assertEquals("-77.01443206518888", tda.getLongitud());
			Assert.assertEquals("", tda.getUbicacion());
			Assert.assertEquals("puesto 666", tda.getPuesto());

			logger.info(tda.toString());

		} catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testFindAllTiendas() {

		try {
			//
			List<Tienda> tdas = tiendaDAO.findAllTiendas();

			// Assert.assertEquals(emps.size(), 1);
			for(Tienda tienda:tdas) {
				logger.info(tienda.getNombre().toString());
			}

		} catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}

	}
	
	@Test
	public void testFindTiendaByName() {

		try {
			//
			Tienda tda = tiendaDAO.findTiendaByName("Industrial san Miguel");
			
			logger.info(tda.getUbicacion());

		} catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testCreateTienda() {

		String nombre = "Galeria Test" + (int)(Math.random() * 100);
		int telefono = 999888777;
		String latitud = "-12.067566";
		String longitud = "-77.013168";
		String ubicacion = "Jr. Pruebas, Java";
		String puesto = "puesto 404";
		int idComerciante = 8;

		try {
			//
			tiendaDAO.create(nombre, telefono, latitud, longitud, ubicacion, puesto, idComerciante);

			//
			Tienda tda = (Tienda) tiendaDAO.findTiendaByName(nombre);

			Assert.assertEquals(nombre, tda.getNombre());
			Assert.assertEquals(telefono, tda.getTelefono());
			Assert.assertEquals(latitud, tda.getLatitud());
			Assert.assertEquals(longitud, tda.getLongitud());
			Assert.assertEquals(ubicacion, tda.getUbicacion());
			Assert.assertEquals(puesto, tda.getPuesto());
			Assert.assertEquals(idComerciante, tda.getIdComerciante());

		} catch (DAOException e) {
			fail(e.getMessage());
		} catch (EmptyResultException e) {
			fail(e.getMessage());
		}

	}

	
	
//	@Test
//	public void testUpdateEmployee() {
//
//		String LOGIN = "jgomezY" + (int)(Math.random() * 100);
//		String PWD = "123";
//		String FIRSTNAME = "Jaime";
//		String LASTNAME = "Gomez";
//		int SALARY = 3000;
//		int DEPT_ID = 14;
//		
//		String UP_PWD = "456";
//		String UP_FIRSTNAME = "Jaime5";
//		String UP_LASTNAME = "Gomez6";
//		int UP_SALARY = 3500;
//		int UP_DEPT_ID = 14;
//		
//		try {
//			//
//			employeeDAO.create(LOGIN, PWD, FIRSTNAME, LASTNAME, SALARY, DEPT_ID);
//			//
//			employeeDAO.update(LOGIN, UP_PWD, UP_FIRSTNAME, UP_LASTNAME, UP_SALARY, UP_DEPT_ID);
//			//
//			Employee emp = employeeDAO.findEmployeeByLogin(LOGIN);
//
//			Assert.assertEquals(UP_PWD, emp.getPassword());
//			Assert.assertEquals(UP_FIRSTNAME, emp.getFirstname());
//			Assert.assertEquals(UP_LASTNAME, emp.getLastname());
//			Assert.assertEquals(UP_SALARY, emp.getSalary());
//
//		} catch (DAOException e) {
//			fail(e.getMessage());
//		} catch (EmptyResultException e) {
//			fail(e.getMessage());
//		}
//
//	}
//	
//	
//	@Test
//	public void testDeleteEmployee() {
//
//		String LOGIN = "jromeroY";
//		String PWD = "123";
//		String FIRSTNAME = "Juan";
//		String LASTNAME = "Romero";
//		int SALARY = 3000;
//		int DEPT_ID = 14;
//
//		try {
//			//
//			employeeDAO.create(LOGIN, PWD, FIRSTNAME, LASTNAME, SALARY, DEPT_ID);
//
//		} catch (DAOException e) {
//			fail(e.getMessage());
//		}
//
//		try {
//
//			employeeDAO.delete(LOGIN);
//
//			employeeDAO.findEmployeeByLogin(LOGIN);
//
//		} catch (DAOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (EmptyResultException e) {
//			// Usuario borrado 
//			return;
//		}
//
//	}
//
//	@After
//	public void after() {
//		logger.info("Despues de cada metodo");
//	}
//	
//	@AfterClass
//	public static void afterClass() {
//		logger.info("Despues de todos los metodos");
//	}

}