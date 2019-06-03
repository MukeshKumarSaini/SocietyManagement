package com.societymanagement.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.societymanagement.Entity.Member;
@Repository
public interface MemberDao {

	public List<Member> allMember();
	public boolean addMember(Member member);
	public boolean updateMember(Member member,int memberId);
	public boolean deleteMember(int memberId);
	public Member getMember(int memberId);

	
}