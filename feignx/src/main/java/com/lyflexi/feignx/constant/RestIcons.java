package com.lyflexi.feignx.constant;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * @Description:
 * @Author: lyflexi
 * @project: feignx-plugin
 * @Date: 2024/10/18 14:56
 */
public interface RestIcons {
    Icon STATEMENT_LINE_FEIGN_ICON = IconLoader.getIcon("/icons/jumpAction_feign.svg", RestIcons.class);
    Icon STATEMENT_LINE_CONTROLLER_ICON = IconLoader.getIcon("/icons/jumpAction_controller.svg", RestIcons.class);
    Icon STATEMENT_LINE_CLIPBOARD_FEIGN_ICON = IconLoader.getIcon("/icons/clipBoard_feign.svg", RestIcons.class);
    Icon STATEMENT_LINE_CLIPBOARD_CONTROLLER_ICON = IconLoader.getIcon("/icons/clipBoard_controller.svg", RestIcons.class);
}

