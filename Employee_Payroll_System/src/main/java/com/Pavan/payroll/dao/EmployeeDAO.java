package com.anurag.payroll.dao;

import com.anurag.payroll.entity.Employee;
import com.anurag.payroll.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class EmployeeDAO {

    // Save employee to database
    public void saveEmployee(Employee employee) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(employee);
            tx.commit();
            System.out.println("✅ Employee saved successfully.");
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Employee> list = em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
        em.close();
        return list;
    }

    // Find employee by ID
    public Employee findEmployeeById(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        Employee emp = em.find(Employee.class, id);
        em.close();
        return emp;
    }

    // Update employee
    public void updateEmployee(Employee employee) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.merge(employee);
            tx.commit();
            System.out.println("✅ Employee updated successfully.");
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    // Delete employee
    public void deleteEmployee(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            Employee emp = em.find(Employee.class, id);
            if (emp != null) {
                tx.begin();
                em.remove(emp);
                tx.commit();
                System.out.println("❌ Employee deleted successfully.");
            } else {
                System.out.println("⚠️ Employee not found!");
            }
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
