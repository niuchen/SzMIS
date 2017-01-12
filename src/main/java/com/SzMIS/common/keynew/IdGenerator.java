package com.SzMIS.common.keynew;
/**
 * 
 * ID生成器接口, 用于生成全局唯一的ID流水号
 * 
 * @author Ivan.Ma
 */
public interface IdGenerator {
	//public void setconfig(IdGeneratorConfig config);
  
  /**
   * 生成下一个不重复的流水号
   * @return
   */
  String next();
  
}