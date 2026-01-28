# SaoBao智能聊天机器人

## 项目简介
SaoBao是一个基于Spring Boot和LangChain4j开发的智能聊天机器人项目，集成了阿里云通义千问大语言模型，支持基于Redis的对话记忆功能，能够实现连续多轮对话。

## 项目亮点
- 🤖 基于阿里云通义千问大模型，具备强大的自然语言处理能力
- 💾 集成Redis存储对话记忆，支持上下文连续对话
- ⚡ 使用Spring WebFlux实现响应式流式对话
- 🔧 简单易用的REST API接口设计
- 🚀 基于Spring Boot的快速部署方案

## 配置教程

### 环境准备
- Java 17+
- Maven 3.6+
- Redis服务器

### 快速开始

1. 克隆项目并进入目录
```bash
git clone <repository_url>
cd saobao
```

2. 修改配置文件 `src/main/resources/application.yml`：
```yaml
server:
  port: 629

spring:
  application:
    name: saobao
  data:
    redis:
      host: localhost          # Redis服务器地址
      port: 6379               # Redis端口
      password: 123456         # Redis密码

langchain4j:
  open-ai:
    streaming-chat-model:
      base-url: https://dashscope.aliyuncs.com/compatible-mode/v1
      api-key: YOUR_API_KEY    # 替换为你的阿里云API密钥
      model-name: qwen-flash
      log-responses: true
      log-requests: true
    chat-model:
      base-url: https://dashscope.aliyuncs.com/compatible-mode/v1
      api-key: YOUR_API_KEY    # 替换为你的阿里云API密钥
      model-name: qwen-flash
      log-responses: true
      log-requests: true
```

3. 启动项目
```bash
mvn spring-boot:run
```

4. 访问API接口
```
GET /chat?memoryId={会话ID}&message={消息内容}
```

## GitHub Star & 相关组件

⭐ 如果你觉得这个项目不错，请给个Star！

本项目使用以下开源技术栈：
- [Spring Boot](https://github.com/spring-projects/spring-boot) - Spring Boot框架
- [LangChain4j](https://github.com/langchain4j/langchain4j) - Java版LangChain实现
- [Redisson](https://github.com/redisson/redisson) - Redis Java客户端
- [OpenAI SDK](https://github.com/llm4j) - 大模型集成支持
- [WebFlux](https://github.com/spring-projects/spring-framework) - Spring响应式编程框架