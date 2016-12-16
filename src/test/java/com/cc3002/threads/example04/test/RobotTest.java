package com.cc3002.threads.example04.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.cc3002.threads.example04.IRobot;
import com.cc3002.threads.example04.Robot;

import org.junit.Before;
import org.junit.Test;

public class RobotTest {

  private IRobot robot;

  @Before
  public void setUp() {
    robot = new Robot("robot one");
  }
  
  @Test
  public void testDefaultName() {
    assertEquals("a robot", new Robot().getName());
  }

  @Test
  public void testGetName() {
    assertEquals("robot one", robot.getName());
  }

  @Test
  public void testSetName() {
    robot.setName("defined name");
    assertEquals("defined name", robot.getName());
  }

  @Test
  public void testGetPosition() {
    assertEquals(1, robot.getPosition());
  }

  @Test
  public void testStepLeft() {
    robot.stepLeft();
    assertEquals(0, robot.getPosition());
  }

  @Test
  public void testStepRight() {
    robot.stepRight();
    assertEquals(2, robot.getPosition());
  }
  
  @Test
  public void testIsWithTrue() {
    final IRobot friend = new Robot("robot two", 2);
    robot = new Robot("robot three", 2);
    assertTrue(robot.isWith(friend));
  }

  @Test
  public void testIsWithFalse() {
    final IRobot friend = new Robot("robot two", 2);
    assertFalse(robot.isWith(friend));
  }
}
