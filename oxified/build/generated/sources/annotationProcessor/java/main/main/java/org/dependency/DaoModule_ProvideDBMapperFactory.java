package main.java.org.dependency;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaoModule_ProvideDBMapperFactory implements Factory<DynamoDBMapper> {
  private final DaoModule module;

  public DaoModule_ProvideDBMapperFactory(DaoModule module) {
    this.module = module;
  }

  @Override
  public DynamoDBMapper get() {
    return provideDBMapper(module);
  }

  public static DaoModule_ProvideDBMapperFactory create(DaoModule module) {
    return new DaoModule_ProvideDBMapperFactory(module);
  }

  public static DynamoDBMapper provideDBMapper(DaoModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDBMapper());
  }
}
