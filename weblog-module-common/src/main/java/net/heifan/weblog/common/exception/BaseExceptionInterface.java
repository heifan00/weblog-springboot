package net.heifan.weblog.common.exception;

/**
 * 通用异常接口
 * @author HiF
 * @date 2023/11/27 22:25
 */
public interface BaseExceptionInterface {
    String getErrorCode();

    String getErrorMessage();
}
