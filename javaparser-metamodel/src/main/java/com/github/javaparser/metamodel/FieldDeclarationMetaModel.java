package com.github.javaparser.metamodel;

import java.util.Optional;

public class FieldDeclarationMetaModel extends BaseNodeMetaModel {

    FieldDeclarationMetaModel(Optional<BaseNodeMetaModel> superBaseNodeMetaModel) {
        super(superBaseNodeMetaModel, com.github.javaparser.ast.body.FieldDeclaration.class, "FieldDeclaration", "com.github.javaparser.ast.body", false, false);
    }

    public PropertyMetaModel modifiersPropertyMetaModel;

    public PropertyMetaModel variablesPropertyMetaModel;
}

