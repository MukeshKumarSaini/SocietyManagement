package com.societymanagement.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.societymanagement.DaoImpl.MemberImpl;
import com.societymanagement.DaoImpl.SocietyMasterImpl;
import com.societymanagement.Entity.Member;
import com.societymanagement.Entity.SocietyMaster;

@ContextConfiguration({ "persistenceconfig.xml" })
@SpringJUnitConfig(MemberTest.class)
public class MemberTest {

	@Autowired
	MemberImpl memberimpl;

	/*@Test
	public void add() {
		Member member = new Member();
		member.setMemberId(1);
		member.setMemberName("deepak");
		member.setMemberAdd("bharatpur");
		member.setEmail("deepak@gmail.com");
		member.setMobileNo(123456);
		member.setSocietyId(1);
		assertEquals(true, memberimpl.addMember(member));
	}*/

	/*
	 * @Test public void get() throws Exception { Member member = new Member();
	 * member = memberimpl.getMember(1); assertEquals("deepak",
	 * member.getMemberName()); }
	 */

	/*
	  @Test public void getAll() throws Exception { List<Member> member = new
	  ArrayList<Member>(); member = memberimpl.allMember(); assertEquals(1,
	  member.size());
	  
	  }*/
	 

	/*
	 * @Test public void update() { Member member = new Member(); member =
	 * memberimpl.getMember(1); member.setMemberName("mukesh");
	 * member.setMemberAdd("jaipur"); member.setEmail("mukesh@gmail.com");
	 * member.setMobileNo(23456); assertEquals(true, memberimpl.updateMember(member,
	 * 1));
	 * 
	 * }
	 */

	/*
	 * @Test public void delete() { Member member = new Member(); member =
	 * memberimpl.getMember(1); assertEquals(true, memberimpl.deleteMember(1)); }
	 */
}
